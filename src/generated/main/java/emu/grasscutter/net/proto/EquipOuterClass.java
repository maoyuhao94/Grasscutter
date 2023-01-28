// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Equip.proto

public final class EquipOuterClass {
  private EquipOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EquipOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Equip)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return Whether the reliquary field is set.
     */
    boolean hasReliquary();
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return The reliquary.
     */
    ReliquaryOuterClass.Reliquary getReliquary();
    /**
     * <code>.Reliquary reliquary = 1;</code>
     */
    ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder();

    /**
     * <code>.Weapon weapon = 2;</code>
     * @return Whether the weapon field is set.
     */
    boolean hasWeapon();
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return The weapon.
     */
    WeaponOuterClass.Weapon getWeapon();
    /**
     * <code>.Weapon weapon = 2;</code>
     */
    WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder();

    /**
     * <code>bool isLocked = 3;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    public EquipOuterClass.Equip.FOIGJKHHNPGCase getFOIGJKHHNPGCase();
  }
  /**
   * Protobuf type {@code Equip}
   */
  public static final class Equip extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Equip)
      EquipOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Equip.newBuilder() to construct.
    private Equip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Equip() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Equip();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Equip(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              ReliquaryOuterClass.Reliquary.Builder subBuilder = null;
              if (fOIGJKHHNPGCase_ == 1) {
                subBuilder = ((ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_).toBuilder();
              }
              fOIGJKHHNPG_ =
                  input.readMessage(ReliquaryOuterClass.Reliquary.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_);
                fOIGJKHHNPG_ = subBuilder.buildPartial();
              }
              fOIGJKHHNPGCase_ = 1;
              break;
            }
            case 18: {
              WeaponOuterClass.Weapon.Builder subBuilder = null;
              if (fOIGJKHHNPGCase_ == 2) {
                subBuilder = ((WeaponOuterClass.Weapon) fOIGJKHHNPG_).toBuilder();
              }
              fOIGJKHHNPG_ =
                  input.readMessage(WeaponOuterClass.Weapon.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((WeaponOuterClass.Weapon) fOIGJKHHNPG_);
                fOIGJKHHNPG_ = subBuilder.buildPartial();
              }
              fOIGJKHHNPGCase_ = 2;
              break;
            }
            case 24: {

              isLocked_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EquipOuterClass.internal_static_Equip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EquipOuterClass.internal_static_Equip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EquipOuterClass.Equip.class, EquipOuterClass.Equip.Builder.class);
    }

    private int fOIGJKHHNPGCase_ = 0;
    private java.lang.Object fOIGJKHHNPG_;
    public enum FOIGJKHHNPGCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      RELIQUARY(1),
      WEAPON(2),
      FOIGJKHHNPG_NOT_SET(0);
      private final int value;
      private FOIGJKHHNPGCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static FOIGJKHHNPGCase valueOf(int value) {
        return forNumber(value);
      }

      public static FOIGJKHHNPGCase forNumber(int value) {
        switch (value) {
          case 1: return RELIQUARY;
          case 2: return WEAPON;
          case 0: return FOIGJKHHNPG_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public FOIGJKHHNPGCase
    getFOIGJKHHNPGCase() {
      return FOIGJKHHNPGCase.forNumber(
          fOIGJKHHNPGCase_);
    }

    public static final int RELIQUARY_FIELD_NUMBER = 1;
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return Whether the reliquary field is set.
     */
    @java.lang.Override
    public boolean hasReliquary() {
      return fOIGJKHHNPGCase_ == 1;
    }
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return The reliquary.
     */
    @java.lang.Override
    public ReliquaryOuterClass.Reliquary getReliquary() {
      if (fOIGJKHHNPGCase_ == 1) {
         return (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_;
      }
      return ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }
    /**
     * <code>.Reliquary reliquary = 1;</code>
     */
    @java.lang.Override
    public ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
      if (fOIGJKHHNPGCase_ == 1) {
         return (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_;
      }
      return ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }

    public static final int WEAPON_FIELD_NUMBER = 2;
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return Whether the weapon field is set.
     */
    @java.lang.Override
    public boolean hasWeapon() {
      return fOIGJKHHNPGCase_ == 2;
    }
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return The weapon.
     */
    @java.lang.Override
    public WeaponOuterClass.Weapon getWeapon() {
      if (fOIGJKHHNPGCase_ == 2) {
         return (WeaponOuterClass.Weapon) fOIGJKHHNPG_;
      }
      return WeaponOuterClass.Weapon.getDefaultInstance();
    }
    /**
     * <code>.Weapon weapon = 2;</code>
     */
    @java.lang.Override
    public WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
      if (fOIGJKHHNPGCase_ == 2) {
         return (WeaponOuterClass.Weapon) fOIGJKHHNPG_;
      }
      return WeaponOuterClass.Weapon.getDefaultInstance();
    }

    public static final int ISLOCKED_FIELD_NUMBER = 3;
    private boolean isLocked_;
    /**
     * <code>bool isLocked = 3;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (fOIGJKHHNPGCase_ == 1) {
        output.writeMessage(1, (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_);
      }
      if (fOIGJKHHNPGCase_ == 2) {
        output.writeMessage(2, (WeaponOuterClass.Weapon) fOIGJKHHNPG_);
      }
      if (isLocked_ != false) {
        output.writeBool(3, isLocked_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fOIGJKHHNPGCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_);
      }
      if (fOIGJKHHNPGCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (WeaponOuterClass.Weapon) fOIGJKHHNPG_);
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isLocked_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof EquipOuterClass.Equip)) {
        return super.equals(obj);
      }
      EquipOuterClass.Equip other = (EquipOuterClass.Equip) obj;

      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (!getFOIGJKHHNPGCase().equals(other.getFOIGJKHHNPGCase())) return false;
      switch (fOIGJKHHNPGCase_) {
        case 1:
          if (!getReliquary()
              .equals(other.getReliquary())) return false;
          break;
        case 2:
          if (!getWeapon()
              .equals(other.getWeapon())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ISLOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      switch (fOIGJKHHNPGCase_) {
        case 1:
          hash = (37 * hash) + RELIQUARY_FIELD_NUMBER;
          hash = (53 * hash) + getReliquary().hashCode();
          break;
        case 2:
          hash = (37 * hash) + WEAPON_FIELD_NUMBER;
          hash = (53 * hash) + getWeapon().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EquipOuterClass.Equip parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EquipOuterClass.Equip parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EquipOuterClass.Equip parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EquipOuterClass.Equip parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EquipOuterClass.Equip parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EquipOuterClass.Equip parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EquipOuterClass.Equip parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EquipOuterClass.Equip parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EquipOuterClass.Equip parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EquipOuterClass.Equip parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EquipOuterClass.Equip parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EquipOuterClass.Equip parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(EquipOuterClass.Equip prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Equip}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Equip)
        EquipOuterClass.EquipOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EquipOuterClass.internal_static_Equip_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EquipOuterClass.internal_static_Equip_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EquipOuterClass.Equip.class, EquipOuterClass.Equip.Builder.class);
      }

      // Construct using EquipOuterClass.Equip.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isLocked_ = false;

        fOIGJKHHNPGCase_ = 0;
        fOIGJKHHNPG_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EquipOuterClass.internal_static_Equip_descriptor;
      }

      @java.lang.Override
      public EquipOuterClass.Equip getDefaultInstanceForType() {
        return EquipOuterClass.Equip.getDefaultInstance();
      }

      @java.lang.Override
      public EquipOuterClass.Equip build() {
        EquipOuterClass.Equip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EquipOuterClass.Equip buildPartial() {
        EquipOuterClass.Equip result = new EquipOuterClass.Equip(this);
        if (fOIGJKHHNPGCase_ == 1) {
          if (reliquaryBuilder_ == null) {
            result.fOIGJKHHNPG_ = fOIGJKHHNPG_;
          } else {
            result.fOIGJKHHNPG_ = reliquaryBuilder_.build();
          }
        }
        if (fOIGJKHHNPGCase_ == 2) {
          if (weaponBuilder_ == null) {
            result.fOIGJKHHNPG_ = fOIGJKHHNPG_;
          } else {
            result.fOIGJKHHNPG_ = weaponBuilder_.build();
          }
        }
        result.isLocked_ = isLocked_;
        result.fOIGJKHHNPGCase_ = fOIGJKHHNPGCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EquipOuterClass.Equip) {
          return mergeFrom((EquipOuterClass.Equip)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EquipOuterClass.Equip other) {
        if (other == EquipOuterClass.Equip.getDefaultInstance()) return this;
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        switch (other.getFOIGJKHHNPGCase()) {
          case RELIQUARY: {
            mergeReliquary(other.getReliquary());
            break;
          }
          case WEAPON: {
            mergeWeapon(other.getWeapon());
            break;
          }
          case FOIGJKHHNPG_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        EquipOuterClass.Equip parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EquipOuterClass.Equip) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int fOIGJKHHNPGCase_ = 0;
      private java.lang.Object fOIGJKHHNPG_;
      public FOIGJKHHNPGCase
          getFOIGJKHHNPGCase() {
        return FOIGJKHHNPGCase.forNumber(
            fOIGJKHHNPGCase_);
      }

      public Builder clearFOIGJKHHNPG() {
        fOIGJKHHNPGCase_ = 0;
        fOIGJKHHNPG_ = null;
        onChanged();
        return this;
      }


      private com.google.protobuf.SingleFieldBuilderV3<
          ReliquaryOuterClass.Reliquary, ReliquaryOuterClass.Reliquary.Builder, ReliquaryOuterClass.ReliquaryOrBuilder> reliquaryBuilder_;
      /**
       * <code>.Reliquary reliquary = 1;</code>
       * @return Whether the reliquary field is set.
       */
      @java.lang.Override
      public boolean hasReliquary() {
        return fOIGJKHHNPGCase_ == 1;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       * @return The reliquary.
       */
      @java.lang.Override
      public ReliquaryOuterClass.Reliquary getReliquary() {
        if (reliquaryBuilder_ == null) {
          if (fOIGJKHHNPGCase_ == 1) {
            return (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_;
          }
          return ReliquaryOuterClass.Reliquary.getDefaultInstance();
        } else {
          if (fOIGJKHHNPGCase_ == 1) {
            return reliquaryBuilder_.getMessage();
          }
          return ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder setReliquary(ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fOIGJKHHNPG_ = value;
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(value);
        }
        fOIGJKHHNPGCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder setReliquary(
          ReliquaryOuterClass.Reliquary.Builder builderForValue) {
        if (reliquaryBuilder_ == null) {
          fOIGJKHHNPG_ = builderForValue.build();
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(builderForValue.build());
        }
        fOIGJKHHNPGCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder mergeReliquary(ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (fOIGJKHHNPGCase_ == 1 &&
              fOIGJKHHNPG_ != ReliquaryOuterClass.Reliquary.getDefaultInstance()) {
            fOIGJKHHNPG_ = ReliquaryOuterClass.Reliquary.newBuilder((ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_)
                .mergeFrom(value).buildPartial();
          } else {
            fOIGJKHHNPG_ = value;
          }
          onChanged();
        } else {
          if (fOIGJKHHNPGCase_ == 1) {
            reliquaryBuilder_.mergeFrom(value);
          }
          reliquaryBuilder_.setMessage(value);
        }
        fOIGJKHHNPGCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder clearReliquary() {
        if (reliquaryBuilder_ == null) {
          if (fOIGJKHHNPGCase_ == 1) {
            fOIGJKHHNPGCase_ = 0;
            fOIGJKHHNPG_ = null;
            onChanged();
          }
        } else {
          if (fOIGJKHHNPGCase_ == 1) {
            fOIGJKHHNPGCase_ = 0;
            fOIGJKHHNPG_ = null;
          }
          reliquaryBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public ReliquaryOuterClass.Reliquary.Builder getReliquaryBuilder() {
        return getReliquaryFieldBuilder().getBuilder();
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      @java.lang.Override
      public ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
        if ((fOIGJKHHNPGCase_ == 1) && (reliquaryBuilder_ != null)) {
          return reliquaryBuilder_.getMessageOrBuilder();
        } else {
          if (fOIGJKHHNPGCase_ == 1) {
            return (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_;
          }
          return ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ReliquaryOuterClass.Reliquary, ReliquaryOuterClass.Reliquary.Builder, ReliquaryOuterClass.ReliquaryOrBuilder> 
          getReliquaryFieldBuilder() {
        if (reliquaryBuilder_ == null) {
          if (!(fOIGJKHHNPGCase_ == 1)) {
            fOIGJKHHNPG_ = ReliquaryOuterClass.Reliquary.getDefaultInstance();
          }
          reliquaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ReliquaryOuterClass.Reliquary, ReliquaryOuterClass.Reliquary.Builder, ReliquaryOuterClass.ReliquaryOrBuilder>(
                  (ReliquaryOuterClass.Reliquary) fOIGJKHHNPG_,
                  getParentForChildren(),
                  isClean());
          fOIGJKHHNPG_ = null;
        }
        fOIGJKHHNPGCase_ = 1;
        onChanged();;
        return reliquaryBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          WeaponOuterClass.Weapon, WeaponOuterClass.Weapon.Builder, WeaponOuterClass.WeaponOrBuilder> weaponBuilder_;
      /**
       * <code>.Weapon weapon = 2;</code>
       * @return Whether the weapon field is set.
       */
      @java.lang.Override
      public boolean hasWeapon() {
        return fOIGJKHHNPGCase_ == 2;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       * @return The weapon.
       */
      @java.lang.Override
      public WeaponOuterClass.Weapon getWeapon() {
        if (weaponBuilder_ == null) {
          if (fOIGJKHHNPGCase_ == 2) {
            return (WeaponOuterClass.Weapon) fOIGJKHHNPG_;
          }
          return WeaponOuterClass.Weapon.getDefaultInstance();
        } else {
          if (fOIGJKHHNPGCase_ == 2) {
            return weaponBuilder_.getMessage();
          }
          return WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder setWeapon(WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fOIGJKHHNPG_ = value;
          onChanged();
        } else {
          weaponBuilder_.setMessage(value);
        }
        fOIGJKHHNPGCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder setWeapon(
          WeaponOuterClass.Weapon.Builder builderForValue) {
        if (weaponBuilder_ == null) {
          fOIGJKHHNPG_ = builderForValue.build();
          onChanged();
        } else {
          weaponBuilder_.setMessage(builderForValue.build());
        }
        fOIGJKHHNPGCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder mergeWeapon(WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (fOIGJKHHNPGCase_ == 2 &&
              fOIGJKHHNPG_ != WeaponOuterClass.Weapon.getDefaultInstance()) {
            fOIGJKHHNPG_ = WeaponOuterClass.Weapon.newBuilder((WeaponOuterClass.Weapon) fOIGJKHHNPG_)
                .mergeFrom(value).buildPartial();
          } else {
            fOIGJKHHNPG_ = value;
          }
          onChanged();
        } else {
          if (fOIGJKHHNPGCase_ == 2) {
            weaponBuilder_.mergeFrom(value);
          }
          weaponBuilder_.setMessage(value);
        }
        fOIGJKHHNPGCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder clearWeapon() {
        if (weaponBuilder_ == null) {
          if (fOIGJKHHNPGCase_ == 2) {
            fOIGJKHHNPGCase_ = 0;
            fOIGJKHHNPG_ = null;
            onChanged();
          }
        } else {
          if (fOIGJKHHNPGCase_ == 2) {
            fOIGJKHHNPGCase_ = 0;
            fOIGJKHHNPG_ = null;
          }
          weaponBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public WeaponOuterClass.Weapon.Builder getWeaponBuilder() {
        return getWeaponFieldBuilder().getBuilder();
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      @java.lang.Override
      public WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
        if ((fOIGJKHHNPGCase_ == 2) && (weaponBuilder_ != null)) {
          return weaponBuilder_.getMessageOrBuilder();
        } else {
          if (fOIGJKHHNPGCase_ == 2) {
            return (WeaponOuterClass.Weapon) fOIGJKHHNPG_;
          }
          return WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          WeaponOuterClass.Weapon, WeaponOuterClass.Weapon.Builder, WeaponOuterClass.WeaponOrBuilder> 
          getWeaponFieldBuilder() {
        if (weaponBuilder_ == null) {
          if (!(fOIGJKHHNPGCase_ == 2)) {
            fOIGJKHHNPG_ = WeaponOuterClass.Weapon.getDefaultInstance();
          }
          weaponBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              WeaponOuterClass.Weapon, WeaponOuterClass.Weapon.Builder, WeaponOuterClass.WeaponOrBuilder>(
                  (WeaponOuterClass.Weapon) fOIGJKHHNPG_,
                  getParentForChildren(),
                  isClean());
          fOIGJKHHNPG_ = null;
        }
        fOIGJKHHNPGCase_ = 2;
        onChanged();;
        return weaponBuilder_;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool isLocked = 3;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool isLocked = 3;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isLocked = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        
        isLocked_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Equip)
    }

    // @@protoc_insertion_point(class_scope:Equip)
    private static final EquipOuterClass.Equip DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EquipOuterClass.Equip();
    }

    public static EquipOuterClass.Equip getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Equip>
        PARSER = new com.google.protobuf.AbstractParser<Equip>() {
      @java.lang.Override
      public Equip parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Equip(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Equip> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Equip> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EquipOuterClass.Equip getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Equip_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Equip_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Equip.proto\032\017Reliquary.proto\032\014Weapon.p" +
      "roto\"d\n\005Equip\022\037\n\treliquary\030\001 \001(\0132\n.Reliq" +
      "uaryH\000\022\031\n\006weapon\030\002 \001(\0132\007.WeaponH\000\022\020\n\010isL" +
      "ocked\030\003 \001(\010B\r\n\013FOIGJKHHNPGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ReliquaryOuterClass.getDescriptor(),
          WeaponOuterClass.getDescriptor(),
        });
    internal_static_Equip_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Equip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Equip_descriptor,
        new java.lang.String[] { "Reliquary", "Weapon", "IsLocked", "FOIGJKHHNPG", });
    ReliquaryOuterClass.getDescriptor();
    WeaponOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
