(ns reagent-tech-radar.server
  (:require [reagent-tech-radar.handler :refer [app]]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

 (defn -main [& args]
   (let [port (Integer/parseInt (or (System/getenv "PORT") "3000"))]
     (run-jetty app {:port port :join? false})))
