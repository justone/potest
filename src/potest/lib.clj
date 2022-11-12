(ns potest.lib)

(defn import-fn-add
  [& vals]
  (apply + vals))

(defn import-var-sub
  [& vals]
  (apply - vals))


(comment
  (import-fn-add 1 2 3)
  (import-var-sub 1 2 3))
