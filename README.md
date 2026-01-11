# Coding 🧑🏻‍💻

Code samples for practice across multiple languages (C, Java, PHP, Python).

## Prerequisites
- C: `cc`/`clang` or `gcc`
- Java: JDK (e.g., 17+)
- Python: Python 3
- PHP: PHP CLI

## Run Examples

### Java
Compile and run a class (example: `stringplus`):

```bash
javac java/stringplus.java
java -cp java stringplus
```

Replace `stringplus` with other class names in the `java/` folder as needed.

### C
Compile and run (example: `sort.c`):

```bash
cc c/sort.c -o c/sort
./c/sort
```

### Python
Run a script (example: `one.py`):

```bash
python3 python/one.py
```

### PHP
Run `devide.php` with local PHP:

```bash
php php/devide.php
```

Or via Docker (no local PHP install required):

```bash
docker run --rm -v "$PWD/php":/app -w /app php:8.2-cli php devide.php
```

## Notes
- Samples are intentionally simple and self-contained.
- Can add files under the corresponding language folder and follow the same run patterns.