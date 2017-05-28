program factorial;
 var
  fact, num, num2 : Integer;
  char1, char2 : Char;
  color, texture, name : String;
  myArray, myArray2 : Array[1..5] of Integer;
 begin
  num := 2;
  if (num > 2) then
   fact := 11
  else
   fact := num * fact(num);

  FOR ii := 1 TO size DO
   begin
    fact := num * fact(num)
   end
 end.