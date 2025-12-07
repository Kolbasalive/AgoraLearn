import React, { useEffect, useState } from "react";

function App() {
    const [message, setMessage] = useState("Loading...");

    useEffect(() => {
        fetch("/api/lesson")
            .then((res) => res.json())
            .then((data) => setMessage(data.name + "!!!"))
            .catch((err) => setMessage("Error fetching data"));
    }, []);

    return (
        <div style={{ padding: "2rem", fontFamily: "Arial", fontSize: "24px" }}>
            {message}
        </div>
    );
}

export default App;
