import React from "react";
import axios from "axios";
import Post from "./Post";

class Posts extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {

        axios
            .get("https://jsonplaceholder.typicode.com/posts")
            .then(() => {

                const posts = [
                    new Post(
                        1,
                        "Introduction to React",
                        "React is a JavaScript library used to build interactive user interfaces using reusable components."
                    ),
                    new Post(
                        2,
                        "Understanding JSX",
                        "JSX allows developers to write HTML-like syntax inside JavaScript, making React applications easier to develop."
                    ),
                    new Post(
                        3,
                        "React Components",
                        "Components are independent and reusable pieces of a React application."
                    ),
                    new Post(
                        4,
                        "Props in React",
                        "Props are used to pass data from a parent component to a child component."
                    ),
                    new Post(
                        5,
                        "State in React",
                        "State stores dynamic data inside a component and updates the UI automatically."
                    ),
                    new Post(
                        6,
                        "Spring Boot REST API",
                        "Spring Boot helps developers build RESTful web services quickly and efficiently."
                    ),
                    new Post(
                        7,
                        "HTTP Methods",
                        "GET retrieves data, POST creates data, PUT updates data, and DELETE removes data."
                    ),
                    new Post(
                        8,
                        "Microservices",
                        "Microservices divide a large application into smaller independent services."
                    ),
                    new Post(
                        9,
                        "Java Collections",
                        "Java Collections Framework provides List, Set, Queue, and Map for efficient data handling."
                    ),
                    new Post(
                        10,
                        "Full Stack Development",
                        "A Java Full Stack Developer builds frontend applications using React and backend services using Spring Boot."
                    )
                ];

                this.setState({
                    posts: posts
                });

            })
            .catch(error => {
                alert(error.message);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        return (
            <div>
                <h1>Blog Posts</h1>

                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;