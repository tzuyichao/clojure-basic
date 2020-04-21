# clojure-basic
learning clojure again


# References
- [x] Getting Clojure
- [ ] Programming Clojure
- [ ] Clojure Applied
- [ ] Living Clojure
- [ ] Quick Clojure
- [ ] Professional Clojure



# Memo

clojure/core.clj
```clojure
(def
 ^{:arglists '([coll])
   :doc "Returns the first item in the collection. Calls seq on its
    argument. If coll is nil, returns nil."
   :added "1.0"
   :static true}
 first (fn ^:static first [coll] (. clojure.lang.RT (first coll))))
```

clojure/lang/RT.java
```java
static public Object first(Object x){
	if(x instanceof ISeq)
		return ((ISeq) x).first();
	ISeq seq = seq(x);
	if(seq == null)
		return null;
	return seq.first();
}
```