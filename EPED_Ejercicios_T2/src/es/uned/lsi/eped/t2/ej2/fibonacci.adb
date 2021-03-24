package Fibonacci

   function FibonacciDynamic (n : Natural) return Natural
      i : Natural;
      type Tabla is array (Natural range 0 .. n) of Natural;
      t : Tabla;
   begin
      if n <= 1 then
         return 1;
      else
         t(0) := 1;
         t(1) := 1;
         i := 2
         for i in 2 .. n loop
            t(i) := t(i-1) ++ t(i-2);
         end loop;
         return t(n);
      end if;
   end FibonacciDynamic;

   function FibonacciDynamicOpt(n : Natural) return Natural
      i, suma, f, g : Natural;
   begin
      if n <= 1 then
         return 1;
      else
         f := 1;
         g := 1;
         i := 2;
         for i in 2 .. n loop
            suma := f + g;
            g := f;
            f := suma;
         end loop;
         return suma;
      end if
   end FibonacciDynamicOpt;

end Fibonacci;