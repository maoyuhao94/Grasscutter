// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessPlayerInfoNotify.proto

public final class IrodoriChessPlayerInfoNotifyOuterClass {
  private IrodoriChessPlayerInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessPlayerInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessPlayerInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
     * @return Whether the playerInfo field is set.
     */
    boolean hasPlayerInfo();
    /**
     * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
     * @return The playerInfo.
     */
    IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getPlayerInfo();
    /**
     * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
     */
    IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder getPlayerInfoOrBuilder();
  }
  /**
   * Protobuf type {@code IrodoriChessPlayerInfoNotify}
   */
  public static final class IrodoriChessPlayerInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessPlayerInfoNotify)
      IrodoriChessPlayerInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessPlayerInfoNotify.newBuilder() to construct.
    private IrodoriChessPlayerInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessPlayerInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessPlayerInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessPlayerInfoNotify(
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
            case 106: {
              IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder subBuilder = null;
              if (playerInfo_ != null) {
                subBuilder = playerInfo_.toBuilder();
              }
              playerInfo_ = input.readMessage(IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playerInfo_);
                playerInfo_ = subBuilder.buildPartial();
              }

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
      return IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.class, IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code IrodoriChessPlayerInfoNotify.DONFJNAFLJA}
     */
    public enum DONFJNAFLJA
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5338;</code>
       */
      PEPPOHPHJOJ(1, 5338),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DONFJNAFLJA DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5338;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5338;
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
      public static DONFJNAFLJA valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DONFJNAFLJA forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5338: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DONFJNAFLJA>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DONFJNAFLJA> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DONFJNAFLJA>() {
              public DONFJNAFLJA findValueByNumber(int number) {
                return DONFJNAFLJA.forNumber(number);
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
        return IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final DONFJNAFLJA[] VALUES = getStaticValuesArray();
      private static DONFJNAFLJA[] getStaticValuesArray() {
        return new DONFJNAFLJA[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static DONFJNAFLJA valueOf(
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

      private DONFJNAFLJA(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:IrodoriChessPlayerInfoNotify.DONFJNAFLJA)
    }

    public static final int PLAYERINFO_FIELD_NUMBER = 13;
    private IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo playerInfo_;
    /**
     * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
     * @return Whether the playerInfo field is set.
     */
    @java.lang.Override
    public boolean hasPlayerInfo() {
      return playerInfo_ != null;
    }
    /**
     * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
     * @return The playerInfo.
     */
    @java.lang.Override
    public IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getPlayerInfo() {
      return playerInfo_ == null ? IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance() : playerInfo_;
    }
    /**
     * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
     */
    @java.lang.Override
    public IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
      return getPlayerInfo();
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
      if (playerInfo_ != null) {
        output.writeMessage(13, getPlayerInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getPlayerInfo());
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
      if (!(obj instanceof IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify)) {
        return super.equals(obj);
      }
      IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify other = (IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify) obj;

      if (hasPlayerInfo() != other.hasPlayerInfo()) return false;
      if (hasPlayerInfo()) {
        if (!getPlayerInfo()
            .equals(other.getPlayerInfo())) return false;
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
      if (hasPlayerInfo()) {
        hash = (37 * hash) + PLAYERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
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
    public static Builder newBuilder(IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify prototype) {
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
     * Protobuf type {@code IrodoriChessPlayerInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessPlayerInfoNotify)
        IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.class, IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.Builder.class);
      }

      // Construct using IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.newBuilder()
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
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      public IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify getDefaultInstanceForType() {
        return IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify build() {
        IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify buildPartial() {
        IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify result = new IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify(this);
        if (playerInfoBuilder_ == null) {
          result.playerInfo_ = playerInfo_;
        } else {
          result.playerInfo_ = playerInfoBuilder_.build();
        }
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
        if (other instanceof IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify) {
          return mergeFrom((IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify other) {
        if (other == IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.getDefaultInstance()) return this;
        if (other.hasPlayerInfo()) {
          mergePlayerInfo(other.getPlayerInfo());
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
        IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo playerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo, IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder, IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder> playerInfoBuilder_;
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       * @return Whether the playerInfo field is set.
       */
      public boolean hasPlayerInfo() {
        return playerInfoBuilder_ != null || playerInfo_ != null;
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       * @return The playerInfo.
       */
      public IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          return playerInfo_ == null ? IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance() : playerInfo_;
        } else {
          return playerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      public Builder setPlayerInfo(IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerInfo_ = value;
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      public Builder setPlayerInfo(
          IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder builderForValue) {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = builderForValue.build();
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      public Builder mergePlayerInfo(IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (playerInfo_ != null) {
            playerInfo_ =
              IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.newBuilder(playerInfo_).mergeFrom(value).buildPartial();
          } else {
            playerInfo_ = value;
          }
          onChanged();
        } else {
          playerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      public Builder clearPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
          onChanged();
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      public IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder getPlayerInfoBuilder() {
        
        onChanged();
        return getPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      public IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
        if (playerInfoBuilder_ != null) {
          return playerInfoBuilder_.getMessageOrBuilder();
        } else {
          return playerInfo_ == null ?
              IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance() : playerInfo_;
        }
      }
      /**
       * <code>.IrodoriChessPlayerInfo playerInfo = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo, IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder, IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder> 
          getPlayerInfoFieldBuilder() {
        if (playerInfoBuilder_ == null) {
          playerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo, IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder, IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder>(
                  getPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          playerInfo_ = null;
        }
        return playerInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessPlayerInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessPlayerInfoNotify)
    private static final IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify();
    }

    public static IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessPlayerInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessPlayerInfoNotify>() {
      @java.lang.Override
      public IrodoriChessPlayerInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessPlayerInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessPlayerInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessPlayerInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessPlayerInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"IrodoriChessPlayerInfoNotify.proto\032\034Ir" +
      "odoriChessPlayerInfo.proto\"\234\001\n\034IrodoriCh" +
      "essPlayerInfoNotify\022+\n\nplayerInfo\030\r \001(\0132" +
      "\027.IrodoriChessPlayerInfo\"O\n\013DONFJNAFLJA\022" +
      "\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\332)\022\017\n\013DCDNILFDF" +
      "LB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          IrodoriChessPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessPlayerInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessPlayerInfoNotify_descriptor,
        new java.lang.String[] { "PlayerInfo", });
    IrodoriChessPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
