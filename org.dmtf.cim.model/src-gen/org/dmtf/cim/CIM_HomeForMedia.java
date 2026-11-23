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
 * A representation of the model object '<em><b>CIM Home For Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In a StorageLibrary or repository for PhysicalMedia, it is reasonable that a specific Media always be placed in a specific Location (rather than anywhere in the repository/ Library). The default location for a PhysicalMedia is called its 'home'. This information is expressed by the HomeForMedia dependency association. (Note that a PhysicalMedia can have at most one 'home', and a StorageMediaLocation can be 'home' to at most one Media.)
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HomeForMedia()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::PhysicalMedia' override.Antecedent='CIM_StorageMediaLocation REF' override.Antecedent.Max='1' override.Antecedent.Description='The Location that is \'home\' to a piece of PhysicalMedia.' override.Dependent='CIM_PhysicalMedia REF' override.Dependent.Max='1' override.Dependent.Description='The PhysicalMedia whose \'home\' or default Location is defined.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HomeForMedia extends CIM_Dependency {
} // CIM_HomeForMedia
