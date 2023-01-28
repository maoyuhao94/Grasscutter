// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeDeleteBlueprintRsp.proto

public final class HomeDeleteBlueprintRspOuterClass {
  private HomeDeleteBlueprintRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeDeleteBlueprintRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeDeleteBlueprintRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 slotId = 10;</code>
     * @return The slotId.
     */
    int getSlotId();
  }
  /**
   * Protobuf type {@code HomeDeleteBlueprintRsp}
   */
  public static final class HomeDeleteBlueprintRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeDeleteBlueprintRsp)
      HomeDeleteBlueprintRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeDeleteBlueprintRsp.newBuilder() to construct.
    private HomeDeleteBlueprintRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeDeleteBlueprintRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeDeleteBlueprintRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeDeleteBlueprintRsp(
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
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              slotId_ = input.readUInt32();
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
      return HomeDeleteBlueprintRspOuterClass.internal_static_HomeDeleteBlueprintRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeDeleteBlueprintRspOuterClass.internal_static_HomeDeleteBlueprintRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.class, HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeDeleteBlueprintRsp.BAMMGLKEGBD}
     */
    public enum BAMMGLKEGBD
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4564;</code>
       */
      PEPPOHPHJOJ(1, 4564),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BAMMGLKEGBD DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4564;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4564;
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
      public static BAMMGLKEGBD valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BAMMGLKEGBD forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4564: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BAMMGLKEGBD>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BAMMGLKEGBD> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BAMMGLKEGBD>() {
              public BAMMGLKEGBD findValueByNumber(int number) {
                return BAMMGLKEGBD.forNumber(number);
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
        return HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final BAMMGLKEGBD[] VALUES = getStaticValuesArray();
      private static BAMMGLKEGBD[] getStaticValuesArray() {
        return new BAMMGLKEGBD[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static BAMMGLKEGBD valueOf(
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

      private BAMMGLKEGBD(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeDeleteBlueprintRsp.BAMMGLKEGBD)
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SLOTID_FIELD_NUMBER = 10;
    private int slotId_;
    /**
     * <code>uint32 slotId = 10;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(10, slotId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, slotId_);
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
      if (!(obj instanceof HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp)) {
        return super.equals(obj);
      }
      HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp other = (HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getSlotId()
          != other.getSlotId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SLOTID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parseFrom(
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
    public static Builder newBuilder(HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp prototype) {
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
     * Protobuf type {@code HomeDeleteBlueprintRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeDeleteBlueprintRsp)
        HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HomeDeleteBlueprintRspOuterClass.internal_static_HomeDeleteBlueprintRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HomeDeleteBlueprintRspOuterClass.internal_static_HomeDeleteBlueprintRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.class, HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.Builder.class);
      }

      // Construct using HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.newBuilder()
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
        retcode_ = 0;

        slotId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HomeDeleteBlueprintRspOuterClass.internal_static_HomeDeleteBlueprintRsp_descriptor;
      }

      @java.lang.Override
      public HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp getDefaultInstanceForType() {
        return HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.getDefaultInstance();
      }

      @java.lang.Override
      public HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp build() {
        HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp buildPartial() {
        HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp result = new HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp(this);
        result.retcode_ = retcode_;
        result.slotId_ = slotId_;
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
        if (other instanceof HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp) {
          return mergeFrom((HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp other) {
        if (other == HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
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
        HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slotId = 10;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slotId = 10;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slotId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeDeleteBlueprintRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeDeleteBlueprintRsp)
    private static final HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp();
    }

    public static HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeDeleteBlueprintRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeDeleteBlueprintRsp>() {
      @java.lang.Override
      public HomeDeleteBlueprintRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeDeleteBlueprintRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeDeleteBlueprintRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeDeleteBlueprintRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public HomeDeleteBlueprintRspOuterClass.HomeDeleteBlueprintRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeDeleteBlueprintRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeDeleteBlueprintRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeDeleteBlueprintRsp.proto\"\212\001\n\026HomeD" +
      "eleteBlueprintRsp\022\017\n\007retcode\030\t \001(\005\022\016\n\006sl" +
      "otId\030\n \001(\r\"O\n\013BAMMGLKEGBD\022\010\n\004NONE\020\000\022\020\n\013P" +
      "EPPOHPHJOJ\020\324#\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOL" +
      "MPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeDeleteBlueprintRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeDeleteBlueprintRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeDeleteBlueprintRsp_descriptor,
        new java.lang.String[] { "Retcode", "SlotId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
