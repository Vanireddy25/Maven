package objectarrays;
    import java.util.Comparator;
    public class Movie {
        private int yearReleased;
        private double rating;
        private double budget;
        private double collectionAmount;
        public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
            this.yearReleased = yearReleased;
            this.rating = rating;
            this.budget = budget;
            this.collectionAmount = collectionAmount;
        }
        public int getYearReleased() {
            return yearReleased;
        }
        public double getRating() {
            return rating;
        }
        public double getBudget() {
            return budget;
        }
        public double getCollectionAmount() {
            return collectionAmount;
        }
        public static Comparator<Movie> ratingAndProfitComparator = Comparator
                .comparing(Movie::getRating)
                .thenComparing(Movie::getProfit, Comparator.reverseOrder());
        public static Comparator<Movie> yearAndRatingComparator = Comparator
                .comparing(Movie::getYearReleased)
                .thenComparing(Movie::getRating, Comparator.reverseOrder());

        public double getProfit() {
            return collectionAmount - budget;
        }
        public static void main(String[] args) {
            // Create sample movies
            Movie movie1 = new Movie(2009, 8.9, 40_000_000, 250_000_000);
            Movie movie2 = new Movie(2010, 9.0, 80_000_000, 500_000_000);
            Movie movie3 = new Movie(2015, 7.8, 60_000_000, 160_000_000);

            // Sort movies by Rating and Profit
            System.out.println("Sorting by Rating and Profit:");
            System.out.println("Before sorting:");
            System.out.println(movie1.getRating() + ", " + movie1.getProfit());
            System.out.println(movie2.getRating() + ", " + movie2.getProfit());
            System.out.println(movie3.getRating() + ", " + movie3.getProfit());

            Movie[] moviesByRatingAndProfit = {movie1, movie2, movie3};
            java.util.Arrays.sort(moviesByRatingAndProfit, Movie.ratingAndProfitComparator);

            System.out.println("\nAfter sorting:");
            for (Movie movie : moviesByRatingAndProfit) {
                System.out.println(movie.getRating() + ", " + movie.getProfit());
            }

            // Sort movies by Year Released and Rating
            System.out.println("\nSorting by Year Released and Rating:");
            System.out.println("Before sorting:");
            System.out.println(movie1.getYearReleased() + ", " + movie1.getRating());
            System.out.println(movie2.getYearReleased() + ", " + movie2.getRating());
            System.out.println(movie3.getYearReleased() + ", " + movie3.getRating());

            Movie[] moviesByYearAndRating = {movie1, movie2, movie3};
            java.util.Arrays.sort(moviesByYearAndRating, Movie.yearAndRatingComparator);

            System.out.println("\nAfter sorting:");
            for (Movie movie : moviesByYearAndRating) {
                System.out.println(movie.getYearReleased() + ", " + movie.getRating());
            }
        }
    }

