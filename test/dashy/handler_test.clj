(ns dashy.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [dashy.handler :refer :all]))

(deftest test-app
  (testing "index page"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))))

  (testing "resource api"
    (let [response (app (mock/request :get "/api/clock"))]
      (is (= (:status response) 200))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
