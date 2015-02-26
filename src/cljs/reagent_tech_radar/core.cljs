(ns reagent-tech-radar.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent-tech-radar.todo :as todo]
              [reagent-tech-radar.sandbox :as sandbox])
    (:import goog.History))



(defn init! []
  (reagent/render-component [sandbox/foo] (.getElementById js/document "app")))
