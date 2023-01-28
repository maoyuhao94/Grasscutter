// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeTeamNameReq.proto

public final class ChangeTeamNameReqOuterClass {
  private ChangeTeamNameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeTeamNameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeTeamNameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string teamName = 8;</code>
     * @return The teamName.
     */
    java.lang.String getTeamName();
    /**
     * <code>string teamName = 8;</code>
     * @return The bytes for teamName.
     */
    com.google.protobuf.ByteString
        getTeamNameBytes();

    /**
     * <code>int32 teamId = 1;</code>
     * @return The teamId.
     */
    int getTeamId();
  }
  /**
   * Protobuf type {@code ChangeTeamNameReq}
   */
  public static final class ChangeTeamNameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeTeamNameReq)
      ChangeTeamNameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeTeamNameReq.newBuilder() to construct.
    private ChangeTeamNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeTeamNameReq() {
      teamName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeTeamNameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeTeamNameReq(
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
            case 8: {

              teamId_ = input.readInt32();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              teamName_ = s;
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
      return ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChangeTeamNameReqOuterClass.ChangeTeamNameReq.class, ChangeTeamNameReqOuterClass.ChangeTeamNameReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ChangeTeamNameReq.OGFMHICCHEC}
     */
    public enum OGFMHICCHEC
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1631;</code>
       */
      PEPPOHPHJOJ(1, 1631),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OGFMHICCHEC DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final OGFMHICCHEC EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1631;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1631;
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
      public static OGFMHICCHEC valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OGFMHICCHEC forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1631: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OGFMHICCHEC>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OGFMHICCHEC> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OGFMHICCHEC>() {
              public OGFMHICCHEC findValueByNumber(int number) {
                return OGFMHICCHEC.forNumber(number);
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
        return ChangeTeamNameReqOuterClass.ChangeTeamNameReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final OGFMHICCHEC[] VALUES = getStaticValuesArray();
      private static OGFMHICCHEC[] getStaticValuesArray() {
        return new OGFMHICCHEC[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static OGFMHICCHEC valueOf(
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

      private OGFMHICCHEC(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ChangeTeamNameReq.OGFMHICCHEC)
    }

    public static final int TEAMNAME_FIELD_NUMBER = 8;
    private volatile java.lang.Object teamName_;
    /**
     * <code>string teamName = 8;</code>
     * @return The teamName.
     */
    @java.lang.Override
    public java.lang.String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        teamName_ = s;
        return s;
      }
    }
    /**
     * <code>string teamName = 8;</code>
     * @return The bytes for teamName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEAMID_FIELD_NUMBER = 1;
    private int teamId_;
    /**
     * <code>int32 teamId = 1;</code>
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
        output.writeInt32(1, teamId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, teamName_);
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
          .computeInt32Size(1, teamId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, teamName_);
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
      if (!(obj instanceof ChangeTeamNameReqOuterClass.ChangeTeamNameReq)) {
        return super.equals(obj);
      }
      ChangeTeamNameReqOuterClass.ChangeTeamNameReq other = (ChangeTeamNameReqOuterClass.ChangeTeamNameReq) obj;

      if (!getTeamName()
          .equals(other.getTeamName())) return false;
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
      hash = (37 * hash) + TEAMNAME_FIELD_NUMBER;
      hash = (53 * hash) + getTeamName().hashCode();
      hash = (37 * hash) + TEAMID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
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
    public static Builder newBuilder(ChangeTeamNameReqOuterClass.ChangeTeamNameReq prototype) {
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
     * Protobuf type {@code ChangeTeamNameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeTeamNameReq)
        ChangeTeamNameReqOuterClass.ChangeTeamNameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ChangeTeamNameReqOuterClass.ChangeTeamNameReq.class, ChangeTeamNameReqOuterClass.ChangeTeamNameReq.Builder.class);
      }

      // Construct using ChangeTeamNameReqOuterClass.ChangeTeamNameReq.newBuilder()
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
        teamName_ = "";

        teamId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_descriptor;
      }

      @java.lang.Override
      public ChangeTeamNameReqOuterClass.ChangeTeamNameReq getDefaultInstanceForType() {
        return ChangeTeamNameReqOuterClass.ChangeTeamNameReq.getDefaultInstance();
      }

      @java.lang.Override
      public ChangeTeamNameReqOuterClass.ChangeTeamNameReq build() {
        ChangeTeamNameReqOuterClass.ChangeTeamNameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ChangeTeamNameReqOuterClass.ChangeTeamNameReq buildPartial() {
        ChangeTeamNameReqOuterClass.ChangeTeamNameReq result = new ChangeTeamNameReqOuterClass.ChangeTeamNameReq(this);
        result.teamName_ = teamName_;
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
        if (other instanceof ChangeTeamNameReqOuterClass.ChangeTeamNameReq) {
          return mergeFrom((ChangeTeamNameReqOuterClass.ChangeTeamNameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChangeTeamNameReqOuterClass.ChangeTeamNameReq other) {
        if (other == ChangeTeamNameReqOuterClass.ChangeTeamNameReq.getDefaultInstance()) return this;
        if (!other.getTeamName().isEmpty()) {
          teamName_ = other.teamName_;
          onChanged();
        }
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
        ChangeTeamNameReqOuterClass.ChangeTeamNameReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChangeTeamNameReqOuterClass.ChangeTeamNameReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object teamName_ = "";
      /**
       * <code>string teamName = 8;</code>
       * @return The teamName.
       */
      public java.lang.String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          teamName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string teamName = 8;</code>
       * @return The bytes for teamName.
       */
      public com.google.protobuf.ByteString
          getTeamNameBytes() {
        java.lang.Object ref = teamName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          teamName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string teamName = 8;</code>
       * @param value The teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        teamName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string teamName = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamName() {
        
        teamName_ = getDefaultInstance().getTeamName();
        onChanged();
        return this;
      }
      /**
       * <code>string teamName = 8;</code>
       * @param value The bytes for teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        teamName_ = value;
        onChanged();
        return this;
      }

      private int teamId_ ;
      /**
       * <code>int32 teamId = 1;</code>
       * @return The teamId.
       */
      @java.lang.Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>int32 teamId = 1;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {
        
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 teamId = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:ChangeTeamNameReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeTeamNameReq)
    private static final ChangeTeamNameReqOuterClass.ChangeTeamNameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChangeTeamNameReqOuterClass.ChangeTeamNameReq();
    }

    public static ChangeTeamNameReqOuterClass.ChangeTeamNameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeTeamNameReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeTeamNameReq>() {
      @java.lang.Override
      public ChangeTeamNameReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeTeamNameReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeTeamNameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeTeamNameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ChangeTeamNameReqOuterClass.ChangeTeamNameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeTeamNameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeTeamNameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeTeamNameReq.proto\"\227\001\n\021ChangeTeam" +
      "NameReq\022\020\n\010teamName\030\010 \001(\t\022\016\n\006teamId\030\001 \001(" +
      "\005\"`\n\013OGFMHICCHEC\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJO" +
      "J\020\337\014\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017" +
      "\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeTeamNameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeTeamNameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeTeamNameReq_descriptor,
        new java.lang.String[] { "TeamName", "TeamId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
