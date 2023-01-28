// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampAcceptGiveItemReq.proto

public final class WinterCampAcceptGiveItemReqOuterClass {
  private WinterCampAcceptGiveItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampAcceptGiveItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampAcceptGiveItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * Protobuf type {@code WinterCampAcceptGiveItemReq}
   */
  public static final class WinterCampAcceptGiveItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampAcceptGiveItemReq)
      WinterCampAcceptGiveItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampAcceptGiveItemReq.newBuilder() to construct.
    private WinterCampAcceptGiveItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampAcceptGiveItemReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampAcceptGiveItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampAcceptGiveItemReq(
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
            case 32: {

              uid_ = input.readUInt32();
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
      return WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.class, WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.Builder.class);
    }

    /**
     * Protobuf enum {@code WinterCampAcceptGiveItemReq.LIKNMOCMKLA}
     */
    public enum LIKNMOCMKLA
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8148;</code>
       */
      PEPPOHPHJOJ(1, 8148),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final LIKNMOCMKLA DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final LIKNMOCMKLA EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8148;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8148;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static LIKNMOCMKLA valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static LIKNMOCMKLA forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8148: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LIKNMOCMKLA>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LIKNMOCMKLA> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LIKNMOCMKLA>() {
              public LIKNMOCMKLA findValueByNumber(int number) {
                return LIKNMOCMKLA.forNumber(number);
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
        return WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final LIKNMOCMKLA[] VALUES = getStaticValuesArray();
      private static LIKNMOCMKLA[] getStaticValuesArray() {
        return new LIKNMOCMKLA[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static LIKNMOCMKLA valueOf(
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

      private LIKNMOCMKLA(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:WinterCampAcceptGiveItemReq.LIKNMOCMKLA)
    }

    public static final int UID_FIELD_NUMBER = 4;
    private int uid_;
    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (uid_ != 0) {
        output.writeUInt32(4, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, uid_);
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
      if (!(obj instanceof WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq)) {
        return super.equals(obj);
      }
      WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq other = (WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq) obj;

      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
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
    public static Builder newBuilder(WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq prototype) {
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
     * Protobuf type {@code WinterCampAcceptGiveItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampAcceptGiveItemReq)
        WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.class, WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.Builder.class);
      }

      // Construct using WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.newBuilder()
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
        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_descriptor;
      }

      @java.lang.Override
      public WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq getDefaultInstanceForType() {
        return WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq build() {
        WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq buildPartial() {
        WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq result = new WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq(this);
        result.uid_ = uid_;
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
        if (other instanceof WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq) {
          return mergeFrom((WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq other) {
        if (other == WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 4;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WinterCampAcceptGiveItemReq)
    }

    // @@protoc_insertion_point(class_scope:WinterCampAcceptGiveItemReq)
    private static final WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq();
    }

    public static WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampAcceptGiveItemReq>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampAcceptGiveItemReq>() {
      @java.lang.Override
      public WinterCampAcceptGiveItemReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampAcceptGiveItemReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampAcceptGiveItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampAcceptGiveItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampAcceptGiveItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!WinterCampAcceptGiveItemReq.proto\"\214\001\n\033" +
      "WinterCampAcceptGiveItemReq\022\013\n\003uid\030\004 \001(\r" +
      "\"`\n\013LIKNMOCMKLA\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ" +
      "\020\324?\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n" +
      "\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampAcceptGiveItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampAcceptGiveItemReq_descriptor,
        new java.lang.String[] { "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
