(ns reagent-tech-radar.sandbox
  (:require [reagent.core :as reagent :refer [atom]]))

(defonce people (atom [{:nome "Ronualdo"} {:nome "Raquel"}]))

(defn add-people [name]
  (swap! people conj {:nome name}))

(defn input-person []
  (let [val (atom "")]
    [:div
     [:input {:type "text"
              :on-change (fn [event] (reset! val (-> event .-target .-value)))
              :on-blur (fn [] (add-people @val))
              :on-key-down #(case (.-which %)
                             13 (add-people @val)
                             27 (reset! val "")
                             nil)}]]))

(defn foo []
  [:div
   [:h1 "People"]
   [:ol
    (for [person @people]
      [:p (:nome person)])]
   [input-person]])