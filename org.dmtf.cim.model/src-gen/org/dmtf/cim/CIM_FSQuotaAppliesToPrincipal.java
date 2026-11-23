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
 * A representation of the model object '<em><b>CIM FS Quota Applies To Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a quota configuration entry and a filesystem principal (i.e., the owner of the filesystem object).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSQuotaAppliesToPrincipal()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::System::FileSystem' override.Antecedent='CIM_FSDomainIdentity REF' override.Antecedent.Key='true' override.Antecedent.Description='The Filesystem principal to which a quota configuration entry applies.' override.Dependent='CIM_FSQuotaConfigEntry REF' override.Dependent.Key='true' override.Dependent.Description='The quota configuration entry that applies to the filesystem principal.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_FSQuotaAppliesToPrincipal extends CIM_Dependency {
} // CIM_FSQuotaAppliesToPrincipal
