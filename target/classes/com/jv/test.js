/**
 * 
 */

function WriteFile() {
  var fso = new ActiveXObject("Scripting.FileSystemObject");
  console.log(fso);
  var fh = fso.CreateTextFile("Test.txt", true);
  console.log(fh);
  fh.WriteLine("Some text goes here...");
  fh.Close();
}


WriteFile();