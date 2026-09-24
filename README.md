# Laboratório de Algoritmos em Java

Repositório pessoal focado no treino de algoritmos imperativos em **Java vanilla**, estruturado com foco em **Programação Modular** e **Separação de Responsabilidades (SoC)**.

## Estrutura

| Arquivo | Responsabilidade |
| :--- | :--- |
| `Main.java` | Ponto de entrada. Cria o vetor e chama `MenuFunction.menu(vetor)`. |
| `MenuFunction.java` | Interface (UI): menu, input do usuário, exibição, geração aleatória. |
| `VetorFunction.java` | Lógica pura: operações em vetores (soma, média, busca, filtro, ordenação). |

**Fluxo:** `Main` → `MenuFunction` → `VetorFunction`. Cada camada só conhece a de baixo.

## Progresso

### Bloco 1 — Básico
- [x] `somar(int[] v)`
- [x] `media(int[] v)`
- [x] `menor(int[] v)`
- [ ] `maior(int[] v)`

### Bloco 2 — Intermediário
- [x] `contarPares(int[] v)`
- [x] `contarOcorrencias(int[] v, int x)`
- [x] `buscaSequencial(int[] v, int x)`
- [x] `inverter(int[] v)`
- [x] `filtrarPares(int[] v)`
- [x] `copiar(int[] v)`

### Bloco 3 — Avançado
- [ ] `temRepetido(int[] v)`
- [ ] `removerRepetidos(int[] v)`
- [ ] `bubbleSort(int[] v)`
- [ ] `intersecao(int[] x, int[] y)`
- [ ] `diferenca(int[] x, int[] y)`
- [ ] `uniao(int[] x, int[] y)`

## Como compilar e rodar

```bash
# Compilar
javac Main.java MenuFunction.java VetorFunction.java

# Rodar
java Main