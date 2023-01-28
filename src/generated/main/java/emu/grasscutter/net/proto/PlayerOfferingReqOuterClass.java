// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingReq.proto

public final class PlayerOfferingReqOuterClass {
  private PlayerOfferingReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerOfferingReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerOfferingReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 offeringId = 9;</code>
     * @return The offeringId.
     */
    int getOfferingId();
  }
  /**
   * Protobuf type {@code PlayerOfferingReq}
   */
  public static final class PlayerOfferingReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerOfferingReq)
      PlayerOfferingReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerOfferingReq.newBuilder() to construct.
    private PlayerOfferingReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerOfferingReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerOfferingReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerOfferingReq(
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

              offeringId_ = input.readUInt32();
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
      return PlayerOfferingReqOuterClass.internal_static_PlayerOfferingReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerOfferingReqOuterClass.internal_static_PlayerOfferingReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PlayerOfferingReqOuterClass.PlayerOfferingReq.class, PlayerOfferingReqOuterClass.PlayerOfferingReq.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerOfferingReq.PIJNKEKKJBH}
     */
    public enum PIJNKEKKJBH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2908;</code>
       */
      PEPPOHPHJOJ(1, 2908),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PIJNKEKKJBH DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final PIJNKEKKJBH EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2908;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2908;
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
      public static PIJNKEKKJBH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PIJNKEKKJBH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2908: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PIJNKEKKJBH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PIJNKEKKJBH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PIJNKEKKJBH>() {
              public PIJNKEKKJBH findValueByNumber(int number) {
                return PIJNKEKKJBH.forNumber(number);
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
        return PlayerOfferingReqOuterClass.PlayerOfferingReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final PIJNKEKKJBH[] VALUES = getStaticValuesArray();
      private static PIJNKEKKJBH[] getStaticValuesArray() {
        return new PIJNKEKKJBH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static PIJNKEKKJBH valueOf(
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

      private PIJNKEKKJBH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerOfferingReq.PIJNKEKKJBH)
    }

    public static final int OFFERINGID_FIELD_NUMBER = 9;
    private int offeringId_;
    /**
     * <code>uint32 offeringId = 9;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
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
      if (offeringId_ != 0) {
        output.writeUInt32(9, offeringId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, offeringId_);
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
      if (!(obj instanceof PlayerOfferingReqOuterClass.PlayerOfferingReq)) {
        return super.equals(obj);
      }
      PlayerOfferingReqOuterClass.PlayerOfferingReq other = (PlayerOfferingReqOuterClass.PlayerOfferingReq) obj;

      if (getOfferingId()
          != other.getOfferingId()) return false;
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
      hash = (37 * hash) + OFFERINGID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerOfferingReqOuterClass.PlayerOfferingReq parseFrom(
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
    public static Builder newBuilder(PlayerOfferingReqOuterClass.PlayerOfferingReq prototype) {
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
     * Protobuf type {@code PlayerOfferingReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerOfferingReq)
        PlayerOfferingReqOuterClass.PlayerOfferingReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PlayerOfferingReqOuterClass.internal_static_PlayerOfferingReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PlayerOfferingReqOuterClass.internal_static_PlayerOfferingReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PlayerOfferingReqOuterClass.PlayerOfferingReq.class, PlayerOfferingReqOuterClass.PlayerOfferingReq.Builder.class);
      }

      // Construct using PlayerOfferingReqOuterClass.PlayerOfferingReq.newBuilder()
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
        offeringId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PlayerOfferingReqOuterClass.internal_static_PlayerOfferingReq_descriptor;
      }

      @java.lang.Override
      public PlayerOfferingReqOuterClass.PlayerOfferingReq getDefaultInstanceForType() {
        return PlayerOfferingReqOuterClass.PlayerOfferingReq.getDefaultInstance();
      }

      @java.lang.Override
      public PlayerOfferingReqOuterClass.PlayerOfferingReq build() {
        PlayerOfferingReqOuterClass.PlayerOfferingReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PlayerOfferingReqOuterClass.PlayerOfferingReq buildPartial() {
        PlayerOfferingReqOuterClass.PlayerOfferingReq result = new PlayerOfferingReqOuterClass.PlayerOfferingReq(this);
        result.offeringId_ = offeringId_;
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
        if (other instanceof PlayerOfferingReqOuterClass.PlayerOfferingReq) {
          return mergeFrom((PlayerOfferingReqOuterClass.PlayerOfferingReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PlayerOfferingReqOuterClass.PlayerOfferingReq other) {
        if (other == PlayerOfferingReqOuterClass.PlayerOfferingReq.getDefaultInstance()) return this;
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
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
        PlayerOfferingReqOuterClass.PlayerOfferingReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PlayerOfferingReqOuterClass.PlayerOfferingReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int offeringId_ ;
      /**
       * <code>uint32 offeringId = 9;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>uint32 offeringId = 9;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {
        
        offeringId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offeringId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        
        offeringId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerOfferingReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerOfferingReq)
    private static final PlayerOfferingReqOuterClass.PlayerOfferingReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PlayerOfferingReqOuterClass.PlayerOfferingReq();
    }

    public static PlayerOfferingReqOuterClass.PlayerOfferingReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerOfferingReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerOfferingReq>() {
      @java.lang.Override
      public PlayerOfferingReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerOfferingReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerOfferingReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerOfferingReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PlayerOfferingReqOuterClass.PlayerOfferingReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerOfferingReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerOfferingReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerOfferingReq.proto\"\211\001\n\021PlayerOffe" +
      "ringReq\022\022\n\nofferingId\030\t \001(\r\"`\n\013PIJNKEKKJ" +
      "BH\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\334\026\022\017\n\013DCDNIL" +
      "FDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020" +
      "\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerOfferingReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerOfferingReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerOfferingReq_descriptor,
        new java.lang.String[] { "OfferingId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
