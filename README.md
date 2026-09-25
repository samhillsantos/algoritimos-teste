# Laboratório de Algoritmos em Java

Repositório pessoal focado no treino de algoritmos imperativos em **Java vanilla**, estruturado com foco em **Programação Modular** e **Separação de Responsabilidades (SoC)**.

## Estrutura

| Arquivo | Responsabilidade |
| :--- | :--- |
| `Main.java` | Ponto de entrada. Só chama `MenuFunction.menuPrincipal()`. |
| `MenuFunction.java` | Interface (UI): navegação, menus, exibição de resultados. |
| `InputFunction.java` | Entrada de dados: `Scanner`, `Random`, criação de vetores e matrizes. |
| `VetorFunction.java` | Lógica pura: operações em vetores. |
| `MatrizFunction.java` | Lógica pura: operações em matrizes. |

**Fluxo:** `Main` → `MenuFunction` → `InputFunction` → `VetorFunction` / `MatrizFunction`. Cada camada só conhece a de baixo.

---

## Progresso

### Vetores

#### Bloco 1 — Básico
- [x] `somar(int[] v)`
- [x] `media(int[] v)`
- [x] `menor(int[] v)`
- [x] `maior(int[] v)`

#### Bloco 2 — Intermediário
- [x] `contarPares(int[] v)`
- [x] `contarOcorrencias(int[] v, int x)`
- [x] `buscaSequencial(int[] v, int x)`
- [x] `inverter(int[] v)`
- [x] `filtrarPares(int[] v)`
- [x] `copiar(int[] v)`

#### Bloco 3 — Avançado
- [x] `temRepetido(int[] v)`
- [x] `removerRepetidos(int[] v)`
- [x] `bubbleSort(int[] v)`
- [ ] `intersecao(int[] x, int[] y)`
- [ ] `diferenca(int[] x, int[] y)`
- [ ] `uniao(int[] x, int[] y)`

### Matrizes

#### Bloco 1 — Básico
- [x] `soma(int[][] m)`
- [ ] `somarLinhas(int[][] m)`
- [ ] `media(int[][] m)`
- [ ] `maior(int[][] m)`
- [ ] `menor(int[][] m)`
- [ ] `contarMaioresQue(int[][] m, int x)`

#### Bloco 2 — Espacial
- [ ] `somaDiagonalPrincipal(int[][] m)`
- [ ] `somaDiagonalSecundaria(int[][] m)`
- [ ] `somaAcimaPrincipal(int[][] m)`
- [ ] `somaAbaixoPrincipal(int[][] m)`
- [ ] `somaLinha(int[][] m, int l)`
- [ ] `somaColuna(int[][] m, int c)`
- [ ] `transposta(int[][] m)`
- [ ] `buscar(int[][] m, int x)`

#### Bloco 3 — Composto
- [ ] `identidade(int[][] m)`
- [ ] `triangularSuperior(int[][] m)`
- [ ] `triangularInferior(int[][] m)`
- [ ] `multiplicarMatrizes(int[][] a, int[][] b)`
- [ ] `determinante3x3(int[][] m)`
- [ ] `rotacionar90(int[][] m)`
- [ ] `simetrica(int[][] m)`
- [ ] `buscarOrdenada(int[][] m, int x)`
- [ ] `jogoDaVelha(int[][] m)`
- [ ] `pascal(int n)`
- [ ] `espiral(int[][] m)`

---

## Como compilar e rodar

```bash
# Compilar
javac Main.java MenuFunction.java InputFunction.java VetorFunction.java MatrizFunction.java

# Rodar
java Main