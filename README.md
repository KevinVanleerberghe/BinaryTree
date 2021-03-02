# Binary Tree implementeren
## Gegeven
- klasse `TreeNode`
- klasse `Tree`
- klasse `App` met uitvoerbare `main()`methode
- 9 testklasses

## Gevraagd

Pas `TreeNode` en `Tree` aan zodat de klasse `Tree` de gevraagde functionaliteit van een binary search tree bevat.

### TreeNode
Schrijf de implementatie van de methode `isInternalNode` en `isLeaf`

Test adhv de testklasse `TreeNodeTest`

### Tree
Schrijf de implementatie van iedere methode in de klasse `Tree`

Werk in volgorde uit:
```
getRoot()
isEmpty()
insert()
min()
max()
search()
traversalLevelOrder()
traversalPreOrder()
traversalInOrder() // Uitdaging
```

Voer de bijhorende testklasses uit om je implementatie te verifiëren. De testklasses kunnen ook dienen als documentatie over wat er verwacht wordt.

**Het is niet toegestaan om code aanpassingen door te voeren in de testklasses**

**Niet uitwerken met recursie**

## Evaluatie
Geslaagd:
- TreeNodeTest
- CreateTreeTest

Voldoende:
- InsertTreeTest
- MinTreeTest
- MaxTreeTest

Goed:
- SearchTreeTest

Zeer goed:
- TraversalTreeLevelOrderTest
- TraversalTreePreOrderTest

Uitstekend:
- TraversalTreeInOrderTest
