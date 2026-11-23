/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Locally Accessible File System Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LocallyAccessibleFileSystemCapabilities specifies the combination of properties that a File Server ComputerSystem (ComputerSystem.Dedicated=16) can support for accessing a LocalFileSystem. The LocallyAccessibleFileSystemCapabilities element is associated to the FileSystemConfigurationService via ElementCapabilities and to the File Server ComputerSystem via ScopedCapabilities. The supported combination of properties is specified by LocallyAccessibleFileSystemSetting elements that are associated with the LocallyAccessibleFileSystemCapabilities element via SettingsDefineCapabilities. These LocallyAccessibleFileSystemSettings must be derived from ScopedSettingData and scoped via ScopedSetting to the same File Server ComputerSystem as the LocallyAccessibleFileSystemCapabilities.
 * The LocallyAccessibleFileSystemCapabilities element specifies the attributes of LocallyAccessibleFileSystemSetting that it can support in its SupportedProperties property. 
 * This class also provides a CreateGoalSettings method that isused to create a LocallyAccessibleFileSystemSetting element to be used as a goal when making a FileSystem locally accessible to the ComputerSystem. The goal is used as a parameter to the FileSystemConfigurationService.CreateFileSystem and FileSystemConfigurationService.ModifyFileSystem methods. If the methods are succesful, a clone of the goal is created that is associated with the FileSystem via ElementSettingData and scoped to the File Server ComputerSystem via ScopedSetting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemCapabilities#getSupportedProperties <em>Supported Properties</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemCapabilities#getSupportedObjectsForAttributeCaching <em>Supported Objects For Attribute Caching</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FilesystemServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LocallyAccessibleFileSystemCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Properties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of property names of the LocallyAccessibleFileSystemSetting that this Capabilities element supports.
	 * "FailurePolicy" indicates that the FailurePolicy property is supported.
	 * "RetriesMax" indicates that the RetriesMaxproperty is supported.
	 * "InitialEnabledState" indicates that the InitialEnabledStateproperty is supported.
	 * "TransmissionRetriesMax" indicates that the TransmissionRetriesMax property is supported.
	 * "RequestRetryPolicy" indicates that the RequestRetryPolicy property is supported.
	 * "RetransmissionTimeout" indicates that the RetransmissionTimeout property is supported.
	 * "CachingOptions" indicates that the CachingOptions property is supported.
	 * "ReadBufferSize" indicates that the ReadBufferSize property is supported.
	 * "WriteBufferSize" indicates that the WriteBufferSize property is supported.
	 * "AttributeCaching" indicates that the AttributeCaching, property is supported.
	 * "ReadWritePolicy" indicates that the ReadWritePolicy property is supported.
	 * "LockPolicy" indicates that the LockPolicy property is supported.
	 * "EnableOnSystemStart" indicates that the EnableOnSystemStart property is supported.
	 * "ReadWritePref" indicates that the ReadWritePref property is supported.
	 * "ExecutePref" indicates that the ExecutePref property is supported.
	 * "RootAccessPref" indicates that the RootAccessPref property is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Properties</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemCapabilities_SupportedProperties()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\",\"0x8000..\"]' Values='[\"FailurePolicy\",\"RetriesMax\",\"InitialEnabledState\",\"RequestRetryPolicy\",\"TransmissionRetriesMax\",\"RetransmissionTimeout\",\"CachingOptions\",\"ReadBufferSize\",\"WriteBufferSize\",\"AttributeCaching\",\"ReadWritePolicy\",\"LockPolicy\",\"EnableOnSystemStart\",\"ReadWritePref\",\"ExecutePref\",\"RootAccessPref\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.FailurePolicy\",\"CIM_LocallyAccessibleFileSystemSetting.RetriesMax\",\"CIM_LocallyAccessibleFileSystemSetting.InitialEnabledState\",\"CIM_LocallyAccessibleFileSystemSetting.RequestRetryPolicy\",\"CIM_LocallyAccessibleFileSystemSetting.TransmissionRetriesMax\",\"CIM_LocallyAccessibleFileSystemSetting.RetransmissionTimeoutMin\",\"CIM_LocallyAccessibleFileSystemSetting.CachingOptions\",\"CIM_LocallyAccessibleFileSystemSetting.BuffersSupport\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCaching\",\"CIM_LocallyAccessibleFileSystemSetting.ReadWritePolicy\",\"CIM_LocallyAccessibleFileSystemSetting.LockPolicy\",\"CIM_LocallyAccessibleFileSystemSetting.EnableOnSystemStart\",\"CIM_LocallyAccessibleFileSystemSetting.ReadWritePref\",\"CIM_LocallyAccessibleFileSystemSetting.ExecutePref\",\"CIM_LocallyAccessibleFileSystemSetting.RootAccessPref\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedProperties();

	/**
	 * Returns the value of the '<em><b>Supported Objects For Attribute Caching</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If AttributeCaching is supported, this specifies the array of objects that can be set up for caching.A subset of these entries will become the entries ofthe AttributeCachingObjects property in the Setting.
	 * These classes represent types of objects stored in a FileSystem -- files and directories as well as others that may be defined in the future. The corresponding Setting properties, AttributeCaching, AttributeCachingTimeMin, and AttributeCachingTimeMax provide the supported features for the type of object. 'None' and 'All' cannot both be specified; if either one is specified, it must be the first entry in the array and the entry is interpreted as the default setting for all objects. If neither 'None' or 'All' are specified, the caching settings for other objects are defaulted by the implementation. If 'Rest' is specified, the entry applies to all known object types other than the named ones. If 'Unknown' is specified it applies to object types not known to this application (this can happen when foreign file systems are mounted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Objects For Attribute Caching</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemCapabilities_SupportedObjectsForAttributeCaching()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"None\",\"All\",\"Rest\",\"File\",\"Directory\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingObjects\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedObjectsForAttributeCaching();

} // CIM_LocallyAccessibleFileSystemCapabilities
