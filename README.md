# capability-irq-subscribe

Atomic authority package for `irq/subscribe`.

- imports: `#{:irq-subscribe}`
- effects: `#{:device-read}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
