// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChooseCurAvatarTeamReq.proto

public final class ChooseCurAvatarTeamReqOuterClass {
  private ChooseCurAvatarTeamReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChooseCurAvatarTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChooseCurAvatarTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 teamId = 6;</code>
     * @return The teamId.
     */
    int getTeamId();
  }
  /**
   * Protobuf type {@code ChooseCurAvatarTeamReq}
   */
  public static final class ChooseCurAvatarTeamReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChooseCurAvatarTeamReq)
      ChooseCurAvatarTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChooseCurAvatarTeamReq.newBuilder() to construct.
    private ChooseCurAvatarTeamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChooseCurAvatarTeamReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChooseCurAvatarTeamReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChooseCurAvatarTeamReq(
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
            case 48: {

              teamId_ = input.readUInt32();
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
      return ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.class, ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ChooseCurAvatarTeamReq.DMNPHACHDEO}
     */
    public enum DMNPHACHDEO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1680;</code>
       */
      PEPPOHPHJOJ(1, 1680),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DMNPHACHDEO DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final DMNPHACHDEO EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1680;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1680;
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
      public static DMNPHACHDEO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DMNPHACHDEO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1680: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DMNPHACHDEO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DMNPHACHDEO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DMNPHACHDEO>() {
              public DMNPHACHDEO findValueByNumber(int number) {
                return DMNPHACHDEO.forNumber(number);
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
        return ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final DMNPHACHDEO[] VALUES = getStaticValuesArray();
      private static DMNPHACHDEO[] getStaticValuesArray() {
        return new DMNPHACHDEO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static DMNPHACHDEO valueOf(
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

      private DMNPHACHDEO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ChooseCurAvatarTeamReq.DMNPHACHDEO)
    }

    public static final int TEAMID_FIELD_NUMBER = 6;
    private int teamId_;
    /**
     * <code>uint32 teamId = 6;</code>
     * @return The teamId.
     */
    @java.lang.Override
    public int getTeamId() {
      return teamId_;
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
      if (teamId_ != 0) {
        output.writeUInt32(6, teamId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, teamId_);
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
      if (!(obj instanceof ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq)) {
        return super.equals(obj);
      }
      ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq other = (ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq) obj;

      if (getTeamId()
          != other.getTeamId()) return false;
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
      hash = (37 * hash) + TEAMID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
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
    public static Builder newBuilder(ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq prototype) {
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
     * Protobuf type {@code ChooseCurAvatarTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChooseCurAvatarTeamReq)
        ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.class, ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.Builder.class);
      }

      // Construct using ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.newBuilder()
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
        teamId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_descriptor;
      }

      @java.lang.Override
      public ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq getDefaultInstanceForType() {
        return ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.getDefaultInstance();
      }

      @java.lang.Override
      public ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq build() {
        ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq buildPartial() {
        ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq result = new ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq(this);
        result.teamId_ = teamId_;
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
        if (other instanceof ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq) {
          return mergeFrom((ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq other) {
        if (other == ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.getDefaultInstance()) return this;
        if (other.getTeamId() != 0) {
          setTeamId(other.getTeamId());
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
        ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int teamId_ ;
      /**
       * <code>uint32 teamId = 6;</code>
       * @return The teamId.
       */
      @java.lang.Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>uint32 teamId = 6;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {
        
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 teamId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamId() {
        
        teamId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChooseCurAvatarTeamReq)
    }

    // @@protoc_insertion_point(class_scope:ChooseCurAvatarTeamReq)
    private static final ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq();
    }

    public static ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChooseCurAvatarTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<ChooseCurAvatarTeamReq>() {
      @java.lang.Override
      public ChooseCurAvatarTeamReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChooseCurAvatarTeamReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChooseCurAvatarTeamReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChooseCurAvatarTeamReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChooseCurAvatarTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ChooseCurAvatarTeamReq.proto\"\212\001\n\026Choos" +
      "eCurAvatarTeamReq\022\016\n\006teamId\030\006 \001(\r\"`\n\013DMN" +
      "PHACHDEO\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\220\r\022\017\n\013" +
      "DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIAB" +
      "GAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChooseCurAvatarTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChooseCurAvatarTeamReq_descriptor,
        new java.lang.String[] { "TeamId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
