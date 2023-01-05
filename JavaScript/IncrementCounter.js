import React from 'react';

const [count, setCount] = React.useState(0)

function IncrementCounter() {
    return count;
    setCount(count + 1)
}

export default IncrementCounter;