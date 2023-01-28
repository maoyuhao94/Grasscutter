// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterIrodoriChessDungeonRsp.proto

public final class EnterIrodoriChessDungeonRspOuterClass {
  private EnterIrodoriChessDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterIrodoriChessDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterIrodoriChessDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 levelId = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool isHardMap = 3;</code>
     * @return The isHardMap.
     */
    boolean getIsHardMap();
  }
  /**
   * Protobuf type {@code EnterIrodoriChessDungeonRsp}
   */
  public static final class EnterIrodoriChessDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterIrodoriChessDungeonRsp)
      EnterIrodoriChessDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterIrodoriChessDungeonRsp.newBuilder() to construct.
    private EnterIrodoriChessDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterIrodoriChessDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterIrodoriChessDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterIrodoriChessDungeonRsp(
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
            case 24: {

              isHardMap_ = input.readBool();
              break;
            }
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              levelId_ = input.readUInt32();
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
      return EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.class, EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code EnterIrodoriChessDungeonRsp.OEMFHLPBHEB}
     */
    public enum OEMFHLPBHEB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8598;</code>
       */
      PEPPOHPHJOJ(1, 8598),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OEMFHLPBHEB DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8598;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8598;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static OEMFHLPBHEB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OEMFHLPBHEB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8598: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OEMFHLPBHEB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OEMFHLPBHEB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OEMFHLPBHEB>() {
              public OEMFHLPBHEB findValueByNumber(int number) {
                return OEMFHLPBHEB.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final OEMFHLPBHEB[] VALUES = getStaticValuesArray();
      private static OEMFHLPBHEB[] getStaticValuesArray() {
        return new OEMFHLPBHEB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static OEMFHLPBHEB valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private OEMFHLPBHEB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EnterIrodoriChessDungeonRsp.OEMFHLPBHEB)
    }

    public static final int LEVELID_FIELD_NUMBER = 11;
    private int levelId_;
    /**
     * <code>uint32 levelId = 11;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ISHARDMAP_FIELD_NUMBER = 3;
    private boolean isHardMap_;
    /**
     * <code>bool isHardMap = 3;</code>
     * @return The isHardMap.
     */
    @java.lang.Override
    public boolean getIsHardMap() {
      return isHardMap_;
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
      if (isHardMap_ != false) {
        output.writeBool(3, isHardMap_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHardMap_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isHardMap_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
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
      if (!(obj instanceof EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp)) {
        return super.equals(obj);
      }
      EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp other = (EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsHardMap()
          != other.getIsHardMap()) return false;
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
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ISHARDMAP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHardMap());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
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
    public static Builder newBuilder(EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp prototype) {
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
     * Protobuf type {@code EnterIrodoriChessDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterIrodoriChessDungeonRsp)
        EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.class, EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.Builder.class);
      }

      // Construct using EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.newBuilder()
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
        levelId_ = 0;

        retcode_ = 0;

        isHardMap_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_descriptor;
      }

      @java.lang.Override
      public EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp getDefaultInstanceForType() {
        return EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp build() {
        EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp buildPartial() {
        EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp result = new EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp(this);
        result.levelId_ = levelId_;
        result.retcode_ = retcode_;
        result.isHardMap_ = isHardMap_;
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
        if (other instanceof EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp) {
          return mergeFrom((EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp other) {
        if (other == EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsHardMap() != false) {
          setIsHardMap(other.getIsHardMap());
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
        EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 11;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 11;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isHardMap_ ;
      /**
       * <code>bool isHardMap = 3;</code>
       * @return The isHardMap.
       */
      @java.lang.Override
      public boolean getIsHardMap() {
        return isHardMap_;
      }
      /**
       * <code>bool isHardMap = 3;</code>
       * @param value The isHardMap to set.
       * @return This builder for chaining.
       */
      public Builder setIsHardMap(boolean value) {
        
        isHardMap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isHardMap = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHardMap() {
        
        isHardMap_ = false;
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


      // @@protoc_insertion_point(builder_scope:EnterIrodoriChessDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterIrodoriChessDungeonRsp)
    private static final EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp();
    }

    public static EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterIrodoriChessDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterIrodoriChessDungeonRsp>() {
      @java.lang.Override
      public EnterIrodoriChessDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterIrodoriChessDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterIrodoriChessDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterIrodoriChessDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterIrodoriChessDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EnterIrodoriChessDungeonRsp.proto\"\243\001\n\033" +
      "EnterIrodoriChessDungeonRsp\022\017\n\007levelId\030\013" +
      " \001(\r\022\017\n\007retcode\030\004 \001(\005\022\021\n\tisHardMap\030\003 \001(\010" +
      "\"O\n\013OEMFHLPBHEB\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ" +
      "\020\226C\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterIrodoriChessDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterIrodoriChessDungeonRsp_descriptor,
        new java.lang.String[] { "LevelId", "Retcode", "IsHardMap", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
