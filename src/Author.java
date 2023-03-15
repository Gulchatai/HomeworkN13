import java.util.Objects;

public class Author {
        private final String authorName;
        private final String authorFamily;
        public Author (String authorName, String authorFamily) {
            this.authorName = authorName;
            this.authorFamily = authorFamily;
        }
        public String getAuthorName() {
            return this.authorName;
        }
        public String getAuthorFamily()
        {
            return this.authorFamily;
        }
        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            else if (other == null || getClass() != other.getClass()) {
                return false;
            }
            Author author = (Author) other;
            return Objects.equals(authorName, author.authorName) && Objects.equals(authorFamily, author.authorFamily);
        }
        @Override
        public int hashCode() {
            return Objects.hash(authorName, authorFamily);
        }
        @Override
        public String toString() {
            return "Author{" +
                    "authorName='" + authorName + '\'' +
                    ", authorFamily='" + authorFamily + '\'' +
                    '}';
        }

}
