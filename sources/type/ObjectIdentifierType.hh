#ifndef __OBJECT_IDENTIFIER_TYPE_HH
#define __OBJECT_IDENTIFIER_TYPE_HH

#include <type/Type.hh>
#include <ber/ASN1ValueReader.hh>
#include <ber/ASN1ValueWriter.hh>

namespace asn1
{

class ObjectIdentifierType : public Type
{
public:

   explicit ObjectIdentifierType() {}

   // Returns type identifier
   virtual TypeID typeID() const { return OBJECT_IDENTIFIER_TYPE; }

   // Checks type parameters for validness
   void checkType(const ObjectIdentifier&) const {}

   // Reads the value
   void read(ASN1ValueReader& reader, ObjectIdentifier& value) const
   { 
      ValueRestorer<ObjectIdentifier> restorer(value);
      
      reader.readObjectIdentifier(value, *this); 

      restorer.restoreNotNeeded();
   }

   // Writes the value
   void write(ASN1ValueWriter& writer, const ObjectIdentifier& value) const
   {
      writer.writeObjectIdentifier(value, *this);
   }

private:
    
   DISALLOW_COPY_AND_ASSIGN(ObjectIdentifierType);
};

}

#endif // __OBJECT_IDENTIFIER_TYPE_HH