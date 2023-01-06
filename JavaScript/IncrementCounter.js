import React from 'react';

const [count, setCount] = React.useState(0)

function IncrementCounter() {
    return count + 1;
    setCount(count + 1)
}

export default IncrementCounter;