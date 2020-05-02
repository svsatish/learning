# YAML

## 1. What is YAML ?

- YAML : yaml aint markup language
- released in year 2001
- It is a Data serialization language - Data serialization is the process of converting data objects present in complex data structures into a byte stream for storage, transfer and distribution purposes.


## 2. When is this used ?

YAML is a powerful language that can be used for 
- configuration files, 
- messages between applications, and 
- saving application state.


## 3. Why is this used ?

- It is powerful, human readable, natural, portable
- XML > JSON > YAML
- It is superset of JSON, it can parse JSON with YAML parser

Example: Represent list of server information
￼
![image](https://user-images.githubusercontent.com/13004816/80870374-0d922d00-8c74-11ea-887f-7b12565000d3.png)

## 4. How is this used ?


### Syntax

- file extension - yaml, yml and few programs may not have any extension
- indentation - use spaces, should be equal within a object
- whitespaces and colon

### Comments

#comment

### Scalars

data objects like string, integer or boolean

Example:
string: “demo”
integer: 5
boolean: true

### Mappings

Hash map / associative arrays / key: value pairs /  dictionaries

Example:
name: satish
gender: male
age: 39
married: true

### Sequences

- list, arrays, collection. start with - (dash-space)
- Sequences can also be combined with mappings to create "sequences of mappings," "mappings of sequences," and even "mappings of mappings" and "sequences and sequences."

Example:
hobbies:
  - sleeping
  - being lazy

### Style

- Block style - recommended and mostly used

Example:
name: satish
address:
    	city: ashburn
    	zipcode: 20148
hobbies:
	- sleeping
	- being lazy


- Flow style - JSON like

Example:
name: “satish”
address: { city: ashburn, zipcode: 20148 }
hobbies: [sleeping, being lazy]


### Structures

- Directive/Document 
- a single yaml file can have multiple directives
- directives start with - - -
- end with …

### Tags

Tags provide us with three functions: The ability to assign a universal resource indicator, the ability to assign local tags to that indicator, and the ability to change how the YAML parser reads certain scalars when processing the YAML itself. We first take a look at how to assign a URI using the %TAG header, then we assign some local tags with !, before finally learning how to use the !! indicator to change the data type of a scalar.
Default data types:
* seq - Sequence
* map - Map
* str - String
* int - Integer
* float - Floating-point decimal
* null - Null
* binary - Binary code
* omap - Ordered map
* set - Unordered set

### Anchors

Anchors allow us to reuse data across a YAML file. Have a list or scalar that needs to be referenced again and again? With an anchor, we can use the & prefix to assign some data a name, then use the * with that name to call it repeatedly throughout the file, making updating large files a quick and easy process.


Lab - https://kodekloud.com/courses/json-path-quiz/lectures/11339234
yaml validator - http://www.yamllint.com/
