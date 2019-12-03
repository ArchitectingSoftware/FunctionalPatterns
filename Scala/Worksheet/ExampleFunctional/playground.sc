//COMPOSITION
def f(s: String) = "f(" + s + ")"
def g(s: String) = "g(" + s + ")"

f("cs575")
g("cs680")

val fComposeG = f _ compose g _   //f(g(x)) g compose with x
val fAndThenG = f _ andThen g _   //g(f(x)) f and then g



var a = f("cool")
g(a)

//fComposeG("cool")
fAndThenG("cool")

f("Hello")
