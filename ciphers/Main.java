class Main {
  public static void main(String[] args) {
    ShuffleCipher shuffler = new ShuffleCipher(1);
		SubstitutionCipher substitute = new SubstitutionCipher(3);
		String coolWord = "ferocious";
		System.out.println(shuffler.encode(coolWord));
		coolWord = "ferocious";
		System.out.println(substitute.encode(coolWord));
		coolWord = "zyxxzy";
		System.out.println(substitute.encode(coolWord));
  }
}