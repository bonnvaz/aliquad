String sourceContent = "Hello, my name is John.";
Pattern pattern = Pattern.compile("my name is (.*)");
Matcher matcher = pattern.matcher(sourceContent);
if (matcher.find()) {
    String value = matcher.group(1);
    System.out.println(value);  // Output: John
}
