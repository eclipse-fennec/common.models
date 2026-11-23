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
 * A representation of the model object '<em><b>CIM Boot OS From FS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between the OperatingSystem and the FileSystem(s) from which this OperatingSystem is loaded. The association is many- to-many since a Distributed OS could depend on several File Systems in order to correctly and completely load.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BootOSFromFS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::OperatingSystem' override.Antecedent='CIM_FileSystem REF' override.Antecedent.Description='The FileSystem from which the OperatingSystem is loaded.' override.Dependent='CIM_OperatingSystem REF' override.Dependent.Description='The OperatingSystem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BootOSFromFS extends CIM_Dependency {
} // CIM_BootOSFromFS
