(ns dashy.views.layout
  (:require (hiccup [page :as hiccup])))

(defn application [title]
  (hiccup/html5 {:lang "en"}
    [:head
      [:meta {:charset "UTF-8"}]
      [:title title]]
    [:body
      [:div#hello]
      (hiccup/include-js "bundle.js")]))
