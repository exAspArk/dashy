(ns dashy.api
  (:require (ring.util [response :as response])
            (dashy.views [layout :as layout])))

(defn resource-api [resource-name _]
  (layout/application "Dashy"))
