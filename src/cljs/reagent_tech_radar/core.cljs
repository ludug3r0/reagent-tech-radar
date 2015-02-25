(ns reagent-tech-radar.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent-tech-radar.todo :as todo])
    (:import goog.History))

(defn init! []
  (reagent/render-component [todo/todo-app] (.getElementById js/document "app")))
