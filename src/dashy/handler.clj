(ns dashy.handler
  (:require (compojure [core :refer [defroutes GET]]
                       [route :as route])
            (ring.middleware [defaults :as middlewares])
            (ring.util [response :as response])
            (dashy [config :refer [config]])))

(defroutes app-routes
  (GET "/" [] (handle-index))
  (route/not-found "Not Found"))

(def app
  (middlewares/wrap-defaults app-routes middlewares/site-defaults))

(defn- handle-index []
  (response/content-type
    (response/resource-response "index.html" {:root "public"})
    "text/html"))
