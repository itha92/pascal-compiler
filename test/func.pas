program factorial;
 var
  fact, num : Integer;
 begin
  num := 2;
  if (num == 2) then
   fact := 11;
  else
   fact := num * fact(num);

  FOR ii := 1 TO size DO
   begin
    writeln("arr[ii]");
    fact := num * fact(num);
   end
 end

end.