(def current-track (ref "Mars, the Bringer of War"))

(println current-track)

(println (deref current-track))

(println @current-track)

(dosync (ref-set current-track "Venus, the Bringer of Peace"))

(println @current-track)