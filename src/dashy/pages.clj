(ns dashy.pages
  (:require (ring.util [response :as response])
            (dashy.views [layout :as layout])))

(defn index-page [_]
  (layout/application "Dashy"))
