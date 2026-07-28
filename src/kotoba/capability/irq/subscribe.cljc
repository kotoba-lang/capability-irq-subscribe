(ns kotoba.capability.irq.subscribe
  "Importable contract for irq/subscribe.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:irq-subscribe}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z3CMYzKaFFvZEco2jkL7wQa9kRcU3", :capability/repository "kotoba-lang/capability-irq-subscribe", :capability/id "irq/subscribe", :capability/effects #{:device-read}, :capability/provider-status :contract-only})
