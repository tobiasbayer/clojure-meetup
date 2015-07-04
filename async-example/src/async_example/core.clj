(require '[clojure.core.async :refer [chan put! <!! go-loop]])

(def my-chan (chan))

(go-loop [] 
  (do 
    (println (str "Channel says: " (<!! my-chan))) 
    (recur)))

(put! my-chan "foo")

(put! my-chan "bar") 
