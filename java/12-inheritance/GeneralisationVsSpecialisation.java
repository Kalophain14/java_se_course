public class GeneralisationVsSpecialisation {

    public static void main(String[] args) {
        // GENERALIZATION vs SPECIALIZATION

// ============================================================================
// GENERALIZATION (Bottom-Up: Specific → General)
// ============================================================================
//
// Definition:
// Generalization is the process of identifying common properties and features
// shared by multiple specific types, then grouping them under a single parent/
// superclass that represents their shared characteristics.
//
// Characteristics:
// - Creates a parent class that defines common attributes and behaviors
// - Multiple child classes inherit from this parent
// - Reduces code duplication by centralizing shared features
// - Moves UP the hierarchy (specific classes → general class)
//
// Example: SmartPhone Hierarchy
//   SmartPhone (superclass)
//   ├── iPhone (child class)
//   ├── Samsung (child class)
//   └── Android Phone (child class)
//
// Why generalize?
// - iPhone, Samsung, and Android Phone all have: screen, battery, processor,
//   touchscreen, camera, etc.
// - Instead of defining these features 3 times, define them ONCE in SmartPhone
// - All child classes inherit these properties automatically


// ============================================================================
// SPECIALIZATION (Top-Down: General → Specific)
// ============================================================================
//
// Definition:
// Specialization is the process of creating specific subtypes from a general
// parent class by adding unique features, properties, or behaviors that are
// specific to each subtype.
//
// Characteristics:
// - Starts with a general parent class
// - Creates child classes with additional/modified features
// - Each child is a specialized version of the parent
// - Moves DOWN the hierarchy (general class → specific classes)
// - Child classes extend or override parent behavior
//
// Example: iPhone Specialization
//   iPhone (parent class)
//   ├── iPhone X (add: OLED screen, Face ID)
//   ├── iPhone 12 (add: A14 processor, 5G support)
//   ├── iPhone 13 (add: A15 processor, improved camera)
//   └── iPhone XS (extends iPhone X with: more storage, better processor)
//
// Why specialize?
// - Base iPhone defines: call(), text(), takePhoto(), chargeBattery()
// - iPhone X specializes by adding: faceUnlock(), oledDisplay()
// - iPhone 12 specializes by adding: support5G(), improvedCamera()
// - Each version inherits base features but adds its own unique capabilities


// ============================================================================
// KEY RELATIONSHIP
// ============================================================================
//
// Generalization and Specialization are INVERSE operations:
//
// ✓ GENERALIZATION: Car + Bike + Bus → generalize → Vehicle
//                   (identify what's common, create parent)
//
// ✓ SPECIALIZATION: Vehicle → specialize → Car, Bike, Bus
//                   (expand general class into specific subtypes)
//
// In Object-Oriented Programming (OOP):
// - Generalization = creating a SUPERCLASS (abstract parent)
// - Specialization = creating SUBCLASSES (concrete children)
// - Relationship = INHERITANCE
// - ABSTRACT CLASSES & INTERFACE = can also achieve the same thing


// ============================================================================
// PRACTICAL EXAMPLE IN CODE
// ============================================================================
//
// GENERALIZATION: Define common properties in parent
//
//   class SmartPhone {
//       String brand;
//       int storageGB;
//       void call(String number) { }
//       void takePhoto() { }
//   }
//
//   class iPhone extends SmartPhone {
//       boolean hasFaceID;
//       void unlockFace() { }
//   }
//
//   class Samsung extends SmartPhone {
//       boolean hasFingerPrint;
//       void unlockFingerprint() { }
//   }
//
// - SmartPhone is the GENERALIZATION (parent)
// - iPhone and Samsung SPECIALIZE SmartPhone (children)
// - Both inherit: brand, storage, call(), takePhoto()
// - Each adds its own unique feature: Face ID vs Fingerprint



//
// ┌─────────────────┬──────────────────────┬──────────────────────┐
// │ Aspect          │ Generalization       │ Specialization       │
// ├─────────────────┼──────────────────────┼──────────────────────┤
// │ Direction       │ Bottom-up (specific) │ Top-down (general)   │
// │ Creates         │ Superclass/Parent    │ Subclass/Child       │
// │ Focus           │ Find common traits   │ Add unique traits    │
// │ Example         │ Car+Bike+Bus→Vehicle │ Vehicle→Car/Bike/Bus │
// │ Code Impact     │ Reduce duplication   │ Extend functionality │
// │ In OOP          │ Abstract Parent      │ Concrete Children    │
// └─────────────────┴──────────────────────┴──────────────────────┘
    }
}
