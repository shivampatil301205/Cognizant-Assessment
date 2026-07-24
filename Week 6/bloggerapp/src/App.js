import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

    return (

        <div>

            <div
                style={{
                    display: "flex",
                    justifyContent: "space-evenly",
                    marginTop: "40px"
                }}
            >

                <div className="st2">

                    <h1>Book Details</h1>

                    <BookDetails />

                </div>

                <div className="v1">

                    <h1>Blog Details</h1>

                    <BlogDetails />

                </div>

                <div className="mystyle1">

                    <h1>Course Details</h1>

                    <CourseDetails />

                </div>

            </div>

        </div>

    );

}

export default App;