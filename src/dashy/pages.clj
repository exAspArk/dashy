(ns dashy.pages
  (:require (ring.util [response :as response])))

(defn index-page [_]
  (response/content-type
    (response/resource-response "index.html" {:root "public"})
    "text/html"))
