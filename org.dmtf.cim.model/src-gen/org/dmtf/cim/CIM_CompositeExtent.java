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
 * A representation of the model object '<em><b>CIM Composite Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CompositeExtent is used to model the distribution of user data across one or more underlying StorageExtents, which may or not be protected by some redundancy mechanism. CompositeExtents represent a contiguous range of logical blocks. CompositeExtents may overlap, however, the underlying StorageExtents within the overlap shall not contain any check data. Distribution of check data may be specified using the CompositeExtentBasedOn association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CompositeExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' ClassConstraint='[\"inv: self.IsComposite=true\"]' UMLPackagePath='CIM::Device::StorageExtents' override.IsComposite='boolean' override.IsComposite.Description='True indicates that the data is a composition of various StorageExtents that are associated to this StorageExtent via the CIM_CompositeBasedOnAssociation.' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_CompositeExtent extends CIM_StorageExtent {
} // CIM_CompositeExtent
