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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM PC Video Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_PCVideoController class has been deprecated in lieu of CIM_DisplayController. 
 * Deprecated description: Capabilities and management of a PCVideoController, a subtype of VideoController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PCVideoController#getVideoArchitecture <em>Video Architecture</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCVideoController#getVideoMode <em>Video Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCVideoController#getNumberOfColorPlanes <em>Number Of Color Planes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCVideoController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DisplayController\"]' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCVideoController extends CIM_VideoController {
	/**
	 * Returns the value of the '<em><b>Video Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The video architecture. For example, VGA (value=5) or PC-98 (160) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Architecture</em>' attribute.
	 * @see #setVideoArchitecture(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCVideoController_VideoArchitecture()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"160\"]' Values='[\"Other\",\"Unknown\",\"CGA\",\"EGA\",\"VGA\",\"SVGA\",\"MDA\",\"HGC\",\"MCGA\",\"8514A\",\"XGA\",\"Linear Frame Buffer\",\"PC-98\"]' MappingStrings='[\"MIF.DMTF|Video|004.2\"]'"
	 * @generated
	 */
	Integer getVideoArchitecture();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCVideoController#getVideoArchitecture <em>Video Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Architecture</em>' attribute.
	 * @see #getVideoArchitecture()
	 * @generated
	 */
	void setVideoArchitecture(Integer value);

	/**
	 * Returns the value of the '<em><b>Video Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current video mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Video Mode</em>' attribute.
	 * @see #setVideoMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCVideoController_VideoMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' MappingStrings='[\"MIF.DMTF|Video|004.3\"]'"
	 * @generated
	 */
	Integer getVideoMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCVideoController#getVideoMode <em>Video Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Mode</em>' attribute.
	 * @see #getVideoMode()
	 * @generated
	 */
	void setVideoMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Color Planes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current number of color planes. If this value is not applicable for the current video configuration, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Color Planes</em>' attribute.
	 * @see #setNumberOfColorPlanes(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCVideoController_NumberOfColorPlanes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Integer getNumberOfColorPlanes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCVideoController#getNumberOfColorPlanes <em>Number Of Color Planes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Color Planes</em>' attribute.
	 * @see #getNumberOfColorPlanes()
	 * @generated
	 */
	void setNumberOfColorPlanes(Integer value);

} // CIM_PCVideoController
