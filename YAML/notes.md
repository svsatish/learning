## What is YAML

- YAML - yaml aint markup language

- Year - 2001

- XML > JSON > YAML

- It is a Data serialization language - Used to convert data objects to Stream of bytes

- It is human readable, natural, portable

- file extension - yaml, yml and few programs may not have any extension

## Syntax

2 spaces for indentation

## Style

Block style - recommended and mostly used
Flow style - JSON like

## Scalars

data object like string, integer or boolean

## Mappings

Hash map, associative arrays, key: value pairs

## Sequences

- list, arrays, collection. start with - (dash-space)

- Sequences can also be combined with mappings to create "sequences of mappings," "mappings of sequences," and even "mappings of mappings" and "sequences and sequences."

## Structures

- Directive/Document 
- a single yaml file can have multiple directives
- directives start with - - -
- end with …

## Comments

"#"

## Tags

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

## Anchors

Anchors allow us to reuse data across a YAML file. Have a list or scalar that needs to be referenced again and again? With an anchor, we can use the & prefix to assign some data a name, then use the * with that name to call it repeatedly throughout the file, making updating large files a quick and easy process.
