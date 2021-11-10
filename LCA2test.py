import unittest
import LCA2


class testLCA(unittest.TestCase):


    def setUP(self):
        self.root = LCA2.root = LCA2.Node(1)
        self.root.left = LCA2.Node(2)
        self.root.right = LCA2.Node(3)
        self.root.left.left = LCA2.Node(4)
        self.root.left.right = LCA2.Node(5)
        self.root.right.left = LCA2.Node(6)
        self.root.right.right = LCA2.Node(7)
        self.root.left.left.left = LCA2.Node(8)
        self.root.left.left.right = LCA2.Node(9)
        


    def test(self):

        self.assertEquals(LCA2.findLCA(LCA2.root, 2, 3), 1) 
        self.assertEquals(LCA2.findLCA(LCA2.root, 5, 7), 1)
        self.assertEquals(LCA2.findLCA(LCA2.root, 2, 4), 2)
        self.assertEquals(LCA2.findLCA(LCA2.root, 4, 5), 2) 
        self.assertEquals(LCA2.findLCA(LCA2.root, 6, 7), 3) 

    def testInvalid(self):
        self.assertEquals(LCA2.findLCA(LCA2.root, 2, 11), -1)

        if __name__ == '__main__':
            unittest.main()