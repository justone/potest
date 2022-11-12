(ns potest.importer
  (:require [potest.core :as core]))

(comment
  ;; go-to-definition on symbol takes you to potest.core
  (core/import-fn-add 2 3 4)
  ;; go-to-definition on symbol takes you to potest.lib
  (core/import-var-sub 4 3 2))
