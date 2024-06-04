package ZodiacSignFinderProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Month of birth: ");
        int month = input.nextInt();


        if (month >= 1 && month <= 12) {
            System.out.print("Day of birth: ");
            int day = input.nextInt();

            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Your sign is Capricorn");
                    } else {
                        System.out.println("Your sign is Aquarius");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day <= 19) {
                        System.out.println("Your sign is Aquarius");
                    } else {
                        System.out.println("Your sign is Pisces");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        System.out.println("Your sign is Pisces");
                    } else {
                        System.out.println("Your sign is Aries");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Your sign is Aries");
                    } else {
                        System.out.println("Your sign is Taurus");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Your sign is Taurus");
                    } else {
                        System.out.println("Your sign is Gemini");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Your sign is Gemini");
                    } else {
                        System.out.println("Your sign is Cancer");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Your sign is Cancer");
                    } else {
                        System.out.println("Your sign is Leo");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Your sign is Leo");
                    } else {
                        System.out.println("Your sign is Virgo");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("Your sign is Virgo");
                    } else {
                        System.out.println("Your sign is Libra");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Your sign is Libra");
                    } else {
                        System.out.println("Your sign is Scorpio");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Your sign is Scorpio");
                    } else {
                        System.out.println("Your sign is Sagittarius");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }

            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Your sign is Sagittarius");
                    } else {
                        System.out.println("Your sign is Capricorn");
                    }
                } else {
                    System.out.println("Invalid day of birth");
                }
            }
        } else {
            System.out.println("Invalid month");
        }
    }
}
