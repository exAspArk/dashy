(ns dashy.api
  (:require (ring.util [response :as response])))

(defn resource-api [resource-name _]
  (response/content-type
    (response/resource-response "index.html" {:root "public"})
    "text/html"))
